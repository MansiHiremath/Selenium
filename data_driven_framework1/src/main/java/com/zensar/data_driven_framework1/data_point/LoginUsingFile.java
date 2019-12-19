package com.zensar.data_driven_framework1.data_point;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

import com.zensar.data_driven_framework1.automation.LoginAutomation;
import com.zensar.data_driven_framework1.beans.LoginPage;

public class LoginUsingFile {
//Access the file which contains the data
	//public static void main(String[] args) throws Exception {
	@Test
	public void loginAutomationTestNG() throws Exception{
	String filePath="LoginDetails.csv";
		FileReader fileReader=new FileReader(filePath);
		BufferedReader br=new BufferedReader(fileReader);
		while(br.ready()) {
			String line=br.readLine();
			System.out.println(line);
			String[] data=line.split(",");
			String email=data[0];
			String password=data[1];
			
			LoginPage loginPage=new LoginPage(email,password);
			LoginAutomation.fillTheLoginForm(loginPage);
		}
	}
	}

