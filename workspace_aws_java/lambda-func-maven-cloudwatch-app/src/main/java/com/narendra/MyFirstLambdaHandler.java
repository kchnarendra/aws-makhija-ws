package com.narendra;

import java.time.LocalDateTime;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyFirstLambdaHandler implements RequestHandler<Map<String, String>, String> {

	@Override
	public String handleRequest(Map<String, String> input, Context context) {

		System.out.println("The Lambda Function input is: " + input);

		LambdaLogger lambdaLogger = context.getLogger();
		lambdaLogger.log("this is LambdaLogger, current date :" + LocalDateTime.now());

		return "The Lambda Function output is: " + LocalDateTime.now();
	}

}
