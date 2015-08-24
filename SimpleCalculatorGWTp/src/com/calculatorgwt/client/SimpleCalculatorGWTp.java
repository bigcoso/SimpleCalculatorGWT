package com.calculatorgwt.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;




/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SimpleCalculatorGWTp implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
		 //TextButton testButton=new TextButton("Prueba");
		Calculator calculadora=new Calculator();
		RootPanel.get("calculatorContainer").add(calculadora);
		 
		/* VerticalPanel vpNumeros=new VerticalPanel();
		 
		 for (int i=1;i<=9;i++)
		 {
			 TextButton testButton= new TextButton();
			 testButton.setText(String.valueOf(i));
			 vpNumeros.add(testButton);
			 
		 }
		 RootPanel.get("calculatorContainer").add(vpNumeros);*/
		  
	}

}
