package com.sx.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
	public class SavePolygon extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String gonInfo=request.getParameter("gonInfo");
		String [] polygon_symbol=gonInfo.split("\\|");
		//�����·��
		String polygon=polygon_symbol[0];
		//����η���
		String symbol=polygon_symbol[1];
		String [] pArray=polygon.split(";");
		String [] sArray=symbol.split(";");
		for (int i = 0; i < pArray.length; i++) {
			System.out.println("�����"+(i+1)+".......................");
			System.out.println("·���� "+pArray[i]);
			String [] temp=sArray[i].split("-");
			System.out.println("�����ɫ�� "+temp[0]);
			System.out.println("�������ɫ�� "+temp[1]);
			System.out.println("�������ʽ�� "+temp[2]);
			System.out.println("����߿�ȣ� "+temp[3]);
			System.out.println("�����ʽ�� "+temp[4]);
		}
	}
}
