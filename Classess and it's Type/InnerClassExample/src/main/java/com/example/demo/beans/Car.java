package com.example.demo.beans;

public class Car {

	public String modelName;
	public boolean isEngineStarted;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public boolean isEngineStarted() {
		return isEngineStarted;
	}

	public void setEngineStarted(boolean isEngineStarted) {
		this.isEngineStarted = isEngineStarted;
	}

	 public class Engine {

		public void startEngine() {

			if (isEngineStarted) {

				System.out.println(modelName + " Engine Already started");

			} else {

				System.out.println(modelName + " Engine started");
				isEngineStarted = true;
			}

		}

		public void stopEngine() {

			if (!isEngineStarted) {

				System.out.println(modelName + " Engine Already stopped");

			} else {

				System.out.println(modelName + " Engine stopped");
				isEngineStarted = false;
			}

		}

	}

}
