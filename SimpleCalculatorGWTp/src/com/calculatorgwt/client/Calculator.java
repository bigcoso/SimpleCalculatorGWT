package com.calculatorgwt.client;

import com.sencha.gxt.widget.core.client.Composite;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.google.gwt.user.client.ui.FlexTable;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;


/*
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
*/
public class Calculator extends Composite {

	private ContentPanel panel;
	private CenterLayoutContainer centrador;
	private TextField visor;
	private VerticalLayoutContainer contenedor;
	private FlexTable ftContenedor;
	//Grid<> cuerpo;

	
	
	
	public Calculator()
	{
		panel=new ContentPanel();
		panel.setPixelSize(400,400);
		
		centrador = new CenterLayoutContainer();
		centrador.add(panel);
		
		contenedor=new VerticalLayoutContainer();
		visor=new TextField();
		
		ftContenedor=new FlexTable();
		
		
		Cuerpo();
		
		contenedor.add(visor,new VerticalLayoutData(-1, -1) );
		contenedor.add(ftContenedor,new VerticalLayoutData(-1, -1));
		panel.add(contenedor);
		
		initWidget(panel);
		
	}
	
	public void Cuerpo()
	{
		ftContenedor.setWidth("50px");

		
		int[][] numeros={{7,8,9},{4,5,6},{1,2,3}};
		
		
		 for (int row=0;row<3;row++)
		 {

			 for (int column=0;column<3;column++)
			 {
				 TextButton testButton= new TextButton();
				 final String numero=String.valueOf(numeros[row][column]);
				 testButton.setText(numero);
				 
				 //Eventos
				 testButton.addSelectHandler(new SelectHandler() {
					   @Override
					   public void onSelect(SelectEvent event) {
					     AddVisorValue(numero);
					     
					   }
				 });
				 ftContenedor.setWidget(row,column,testButton);
			 }
			 
			 
		 }
		 

		 
		
	}
	
	 public void AddVisorValue(String valor)
	 {
		 //Valor actual del Visor
		 String valorActual=visor.getText();
		 
		 //Añadimos el nuevo numero
		 visor.setText(valorActual + valor );
	 }
	 

	 

	 
	/*
	 * public Calculator()
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
	*/
}
