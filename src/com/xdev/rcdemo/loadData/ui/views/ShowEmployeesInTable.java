package com.xdev.rcdemo.loadData.ui.views;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.xdev.rcdemo.loadData.entities.Employee;
import com.xdev.rcdemo.loadData.entities.Employee_;
import com.xdev.rcdemo.loadData.ui.generators.EmployeePhotoColumn;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevHorizontalLayout;
import com.xdev.ui.XdevVerticalLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;

public class ShowEmployeesInTable extends XdevView {

	/**
	 *
	 */
	public ShowEmployeesInTable() {
		super();
		this.initUI();
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		super.enter(event);
	
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.verticalLayout = new XdevVerticalLayout();
		this.horizontalLayoutHeader = new XdevHorizontalLayout();
		this.button = new XdevButton();
		this.table = new XdevTable<>();

		this.horizontalLayoutHeader.setMargin(new MarginInfo(false));
		this.button.setCaption("Back");
		this.table.setContainerDataSource(Employee.class);
		this.table.addGeneratedColumn("photo", new EmployeePhotoColumn.Generator());
		this.table.setVisibleColumns(Employee_.employeeid.getName(), Employee_.lastname.getName(),
				Employee_.firstname.getName(), Employee_.photo.getName());

		this.button.setSizeUndefined();
		this.horizontalLayoutHeader.addComponent(this.button);
		this.horizontalLayoutHeader.setComponentAlignment(this.button, Alignment.MIDDLE_CENTER);
		final CustomComponent horizontalLayoutHeader_spacer = new CustomComponent();
		horizontalLayoutHeader_spacer.setSizeFull();
		this.horizontalLayoutHeader.addComponent(horizontalLayoutHeader_spacer);
		this.horizontalLayoutHeader.setExpandRatio(horizontalLayoutHeader_spacer, 1.0F);
		this.horizontalLayoutHeader.setWidth(100, Unit.PERCENTAGE);
		this.horizontalLayoutHeader.setHeight(-1, Unit.PIXELS);
		this.verticalLayout.addComponent(this.horizontalLayoutHeader);
		this.verticalLayout.setComponentAlignment(this.horizontalLayoutHeader, Alignment.MIDDLE_CENTER);
		this.table.setSizeFull();
		this.verticalLayout.addComponent(this.table);
		this.verticalLayout.setComponentAlignment(this.table, Alignment.MIDDLE_CENTER);
		this.verticalLayout.setExpandRatio(this.table, 100.0F);
		this.verticalLayout.setSizeFull();
		this.setContent(this.verticalLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button;
	private XdevHorizontalLayout horizontalLayoutHeader;
	private XdevVerticalLayout verticalLayout;
	private XdevTable<Employee> table;
	// </generated-code>

}