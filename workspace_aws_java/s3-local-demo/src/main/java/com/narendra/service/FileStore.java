package com.narendra.service;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;

@Service
public class FileStore {

	Logger logger = LogManager.getLogger(this.getClass().getName());

	@Autowired
	private AmazonS3 amazonS3;

	public String createBucket(String bucketName) {
		logger.info("Inside method createBucket()");
		try {
			if (checkBucketAlreadyExists(bucketName)) {
				logger.error("bucket already exists");
			}
			amazonS3.createBucket(bucketName);
		} catch (AmazonS3Exception e) {
			logger.error("Unable to create bucket : " + e.getErrorMessage());
		}
		return "Bucket created with name : " + bucketName;
	}

	private boolean checkBucketAlreadyExists(String bucketName) {
		logger.info("Inside method checkBucketAlreadyExists()");
		return amazonS3.doesBucketExistV2(bucketName);
	}

	public void uploadFileToBucket(MultipartFile multipartFile, String bucketName)
			throws IllegalStateException, IOException {
		
		logger.info("Inside method uploadFileToBucket()");
		File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + multipartFile.getOriginalFilename());
		multipartFile.transferTo(convFile);
		
		try {
			amazonS3.putObject(bucketName, convFile.getName(), convFile);
		} catch (AmazonS3Exception e) {
			logger.error("Unable to upload file : " + e.getErrorMessage());
		}
	}
	
	public void deleteBucket(String bucketName) {
		amazonS3.deleteBucket(bucketName);
	}

	public void deleteFile(String bucketName, String fileName) {
		amazonS3.deleteObject(bucketName, fileName);
	}
}
