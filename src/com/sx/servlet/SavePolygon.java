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
		//多边形路径
		String polygon=polygon_symbol[0];
		//多边形符号
		String symbol=polygon_symbol[1];
		String [] pArray=polygon.split(";");
		String [] sArray=symbol.split(";");
		for (int i = 0; i < pArray.length; i++) {
			System.out.println("多边形"+(i+1)+".......................");
			System.out.println("路径： "+pArray[i]);
			String [] temp=sArray[i].split("-");
			System.out.println("填充颜色： "+temp[0]);
			System.out.println("外边线颜色： "+temp[1]);
			System.out.println("外边线样式： "+temp[2]);
			System.out.println("外边线宽度： "+temp[3]);
			System.out.println("填充样式： "+temp[4]);
		}
	}
}
