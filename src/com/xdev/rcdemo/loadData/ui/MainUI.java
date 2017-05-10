
package com.xdev.rcdemo.loadData.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.shared.ui.ui.Transport;
import com.xdev.rcdemo.loadData.ui.views.ShowEmployee;
import com.xdev.rcdemo.loadData.ui.views.ShowEmployeesInTable;
import com.xdev.rcdemo.loadData.ui.views.ShowInTable;
import com.xdev.rcdemo.loadData.ui.views.ShowPDF;
import com.xdev.ui.XdevUI;
import com.xdev.ui.navigation.XdevNavigator;

@Push(value = PushMode.MANUAL, transport = Transport.LONG_POLLING)
@Theme("rapidclipse_demo_loadData")
public class MainUI extends XdevUI {
	public MainUI() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(VaadinRequest request) {
		this.initUI();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.navigator = new XdevNavigator(this, this);
	
		this.navigator.addView("", MainView.class);
		this.navigator.addView("employeeForm", ShowEmployee.class);
		this.navigator.addView("employeesInTable", ShowEmployeesInTable.class);
		this.navigator.addView("showPDF", ShowPDF.class);
		this.navigator.addView("categoryTable", ShowInTable.class);
	
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevNavigator navigator; // </generated-code>
}