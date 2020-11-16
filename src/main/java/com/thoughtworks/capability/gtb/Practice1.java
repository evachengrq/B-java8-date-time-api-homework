package com.thoughtworks.capability.gtb;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfYear();

    int monthOfLabourDay = 5;
    int dayOfLabourDay = 1;

    LocalDate labourDay;
    if (month < monthOfLabourDay) {
      labourDay = LocalDate.of(year, monthOfLabourDay, dayOfLabourDay);
    } else {
      labourDay = LocalDate.of(year + 1, monthOfLabourDay, dayOfLabourDay);
    }

    return(labourDay.toEpochDay() - date.toEpochDay());
  }
}
