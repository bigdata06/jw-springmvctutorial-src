package app.webservice;

import javax.xml.ws.Endpoint;

public class NotebookWebServicePublisher {
	public static void main(String[] args) throws ClassNotFoundException {
		Endpoint.publish("http://localhost:9991/ws/NotebookService",
				new NotebookServiceImpl());
	}
}
