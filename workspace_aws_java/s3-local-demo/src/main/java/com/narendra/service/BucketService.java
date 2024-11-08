package com.narendra.service;

import java.io.InputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.IOUtils;

@Service
public class BucketService {

	@Autowired
	private FileStore fileStore;

	private Logger logger = LogManager.getLogger(this.getClass().getName());

	public void logFileDataToLogger(String fileName, AmazonS3 amazonS3, String bucketName) {
		try {
			logger.info("File to be fetch from s3 {} " + fileName);

			S3Object s3Object = amazonS3.getObject(bucketName, fileName);
			InputStream objectContent = s3Object.getObjectContent();
			String content = IOUtils.toString(objectContent);

			logger.info("Content : " + content);

		} catch (Exception e) {
			logger.error("Error occured : " + e.getMessage());
		}
	}

	public String createBucket(String bucketName) {
		return fileStore.createBucket(bucketName);
	}

	public String uploadFile(MultipartFile file, String fileName) {

		if (file.isEmpty()) {
			throw new IllegalStateException("Cannot uploas empty file");
		}

		try {
			fileStore.uploadFileToBucket(file, fileName);
		} catch (Exception e) {
			throw new IllegalStateException("Failed to upload file ", e);
		}

		return "File uploaded successfully";
	}

	public String deleteBucket(String bucketName) {
		fileStore.deleteBucket(bucketName);
		return "Bucket deleted successfully";
	}

	public String deleteFile(String bucketName, String fileName) {
		fileStore.deleteFile(bucketName, fileName);
		return "File delted successfully";
	}
}
