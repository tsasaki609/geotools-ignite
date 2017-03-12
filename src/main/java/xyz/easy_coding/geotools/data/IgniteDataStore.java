package xyz.easy_coding.geotools.data;

import java.io.IOException;
import java.util.List;

import org.geotools.data.store.ContentDataStore;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureSource;
import org.opengis.feature.type.Name;

public class IgniteDataStore extends ContentDataStore {

	@Override
	protected List<Name> createTypeNames() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected ContentFeatureSource createFeatureSource(ContentEntry entry) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
