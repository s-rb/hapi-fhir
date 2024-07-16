package ca.uhn.fhir.tinder.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleSetter implements Cloneable {

	private String myDatatype;
	private List<Parameter> myParameters = new ArrayList<Parameter>();
	private String mySuffix;

	public String getDatatype() {
		return myDatatype;
	}

	public List<Parameter> getParameters() {
		return myParameters;
	}

	public String getSuffix() {
		return mySuffix;
	}

	public void setDatatype(String theDatatype) {
		myDatatype = theDatatype;
	}

	public void setSuffix(String theSuffix) {
		mySuffix = theSuffix;
	}

	@Override
	public SimpleSetter clone() throws CloneNotSupportedException {
		SimpleSetter clone = (SimpleSetter) super.clone();
		clone.myDatatype = myDatatype;
		clone.mySuffix = mySuffix;
		clone.myParameters = new ArrayList<>();
		for (Parameter p : myParameters) {
			clone.myParameters.add(p.clone());
		}
		return clone;
	}

	public static class Parameter {

		private String myDatatype;
		private String myParameter;

		public String getDatatype() {
			return myDatatype;
		}

		public String getParameter() {
			return myParameter;
		}

		public void setDatatype(String theDatatype) {
			myDatatype = theDatatype;
		}

		public void setParameter(String theParameter) {
			myParameter = theParameter;
		}

		@Override
		public Parameter clone() throws CloneNotSupportedException {
			Parameter clone = (Parameter) super.clone();
			clone.myDatatype = this.myDatatype;
			clone.myParameter = this.myParameter;
			return clone;
		}
	}
}
