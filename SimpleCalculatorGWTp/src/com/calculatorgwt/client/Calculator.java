package com.calculatorgwt.client;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;

public class Calculator {

	public Calculator()
	{
		VerticalPanel vpNumeros=new VerticalPanel();
		
		FlexTable ftContenedor=ViewerNumbers();
		RootPanel.get("calculatorContainer").add(ftContenedor);
		
	}
	
	public FlexTable ViewerNumbers()
	{
		FlexTable ftContenedor=new FlexTable();
		int[][] numeros={{7,8,9},{4,5,6},{1,2,3}};
		
		
		ftContenedor.setWidth("150px");
		

		 
		 
		 for (int row=0;row<3;row++)
		 {

			 for (int column=0;column<3;column++)
			 {
				 TextButton testButton= new TextButton();
				 testButton.setText(String.valueOf(numeros[row][column]));
				 
				 ftContenedor.setWidget(row,column,testButton);
			 }
			 
			 
		 }
		 return ftContenedor;
	}
}
