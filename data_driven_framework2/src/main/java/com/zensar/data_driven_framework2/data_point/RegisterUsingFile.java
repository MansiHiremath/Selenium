package com.zensar.data_driven_framework2.data_point;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.zensar.data_driven_framework2.automation.RegisterAutomation;
import com.zensar.data_driven_framework2.beans.RegisterPage;

public class RegisterUsingFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String filePath="UserAccounts.csv";
FileReader fileReader=new FileReader(filePath);
BufferedReader br=new BufferedReader(fileReader);
while(br.ready()) {
	String line=br.readLine();
	System.out.println(line);
	String[] data=line.split(",");
	String name = data[0];
	String email = data[1];
	String phone=data[2];
	String gender = data[3];
	String password = data[4];
	String country = data[5];
	String weeklyEmail=data[6];
	String monthlyEmail=data[7];
	String occassionalEmail=data[8];
	
	RegisterPage registerPage=new RegisterPage(name,email,phone,gender,password,country,weeklyEmail,monthlyEmail,occassionalEmail);
RegisterAutomation.fillTheRegisterForm(registerPage);
}

	}

}
