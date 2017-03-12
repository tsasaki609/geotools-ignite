package xyz.easy_coding.geotools.data;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFactorySpi;

public class IgniteDataStoreFactory implements DataStoreFactorySpi {

	public static final Param[] PARAMS = new Param[]{

	};

	public String getDisplayName() {
		return "Apache Ignite";
	}

	public String getDescription() {
		return "In Memory Distributed Data Grid";
	}

	public Param[] getParametersInfo() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public boolean canProcess(Map<String, Serializable> params) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public boolean isAvailable() {
		try {
            Class.forName("com.csvreader.CsvReader");//TODO
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
	}

	public Map<Key, ?> getImplementationHints() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public DataStore createDataStore(Map<String, Serializable> params) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public DataStore createNewDataStore(Map<String, Serializable> params) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
