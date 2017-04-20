package org.influxdb.impl;

import java.util.List;
import org.influxdb.InfluxDBBatchListener;
import org.influxdb.dto.Point;

/**
 * @author kkarski [at] appcrossings.com
 */
public class BaseInfluxDBListener implements InfluxDBBatchListener {

  @Override
  public void onPointBatchWrite(final List<Point> points) {
  }

  @Override
  public void onException(final List<Point> points, final Throwable e) {
  }
}
