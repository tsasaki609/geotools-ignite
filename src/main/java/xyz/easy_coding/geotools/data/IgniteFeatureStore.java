package xyz.easy_coding.geotools.data;

import java.io.IOException;

import org.geotools.data.FeatureReader;
import org.geotools.data.FeatureWriter;
import org.geotools.data.Query;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureStore;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

@SuppressWarnings("unchecked")
public class IgniteFeatureStore extends ContentFeatureStore {

	public IgniteFeatureStore(ContentEntry entry, Query query) {
		super(entry, query);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	protected FeatureWriter<SimpleFeatureType, SimpleFeature> getWriterInternal(Query query, int flags)
			throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected ReferencedEnvelope getBoundsInternal(Query query) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected int getCountInternal(Query query) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	protected FeatureReader<SimpleFeatureType, SimpleFeature> getReaderInternal(Query query) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected SimpleFeatureType buildFeatureType() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
