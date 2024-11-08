package com.narendra.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;

public class S3EventConsumerLambdaHandler implements RequestHandler<S3Event, String> {

	@Override
	public String handleRequest(S3Event event, Context context) {
		
		S3EventNotificationRecord record = event.getRecords().get(0);
		System.out.println("S3 Bucket name is:" + record.getS3().getBucket().getName());
		String fileName = record.getS3().getObject().getKey();
		
		if (fileName.contains("success")) {
			System.out.println("Inside S3EventConsumerLambdaHandler success case");
			return "Success event is triggered from S3EventConsumerLambdaHandler check lambda function logs";
		} else {
			System.out.println("Inside S3EventConsumerLambdaHandler failure case");
			throw new RuntimeException("Throwing exception to check failure case");
		}

	}
}