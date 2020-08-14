package com.constants;

public class Constants {

	public class RequestMapping {
		public static final String CUSTOMER = "/customer";
		public static final String CUSTOMER_LIST = "/list";
		public static final String ADD_CUSTOMER="/ShowFormToAdd";
		public static final String SAVE_CUSTOMER="/save";
		public static final String UPDATE_CUSTOMER="/ShowFormToUpdate";
		public static final String DELETE_CUSTOMER="/delete";
	}

	public class Action{
		public static final String ADD_CUSTOMER="save";

	}
	public class Views {
		public static final String CUSTOMER_LIST = "list-customers";
		public static final String CUSTOMER_FORM="customer-form";
	}

	public class Table{
		public class Customer {
			public static final String TABLE = "customer";
			public class Column{
				public static final String ID="id";
				public static final String FIRST_NAME="first_name";
				public static final String LAST_NAME="last_name";
				public static final String EMAIL="email";
			}
		}
	}
	
	public class Model{
		public static final String CUSTOMER="customer";
	}

}
