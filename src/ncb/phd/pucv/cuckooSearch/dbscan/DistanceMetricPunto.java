package ncb.phd.pucv.cuckooSearch.dbscan;

//import org.apache.commons.math3.ml.distance.EuclideanDistance;

import ncb.phd.pucv.cuckooSearch.dbscan.DBSCANClusteringException;
import ncb.phd.pucv.cuckooSearch.dbscan.DistanceMetric;
import ncb.phd.pucv.cuckooSearch.dbscan.Punto;

/**
 * Distance metric implementation for numeric values.
 * 
 * @author <a href="mailto:nicolas.caselli@gmail.com">Nicolás Caselli</a>
 * @version 0.1
 *
 */
public class DistanceMetricPunto implements DistanceMetric<Punto>{

	@Override
	public double calculateDistance(Punto val1, Punto val2) throws DBSCANClusteringException {
		// TODO Auto-generated method stub
//		return Math.abs(val1.get(0) - val2.get(0));
//		return EuclideanDistance.compute(val1.get(), val2.get());
		//Distancia Euclideana:
		Double d = 0d;
		for (int i = 0; i < val1.getGrado(); i++) {
			d += Math.pow(val1.get(i) - val2.get(i), 2);
		}
		return Math.sqrt(d);
	}

}
