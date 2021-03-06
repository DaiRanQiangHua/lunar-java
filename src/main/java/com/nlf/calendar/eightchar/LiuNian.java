package com.nlf.calendar.eightchar;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.util.LunarUtil;

/**
 * 流年
 *
 * @author 6tail
 */
public class LiuNian {
  /**
   * 序数，0-9
   */
  private int index;
  /**
   * 大运
   */
  private DaYun daYun;
  /**
   * 年
   */
  private int year;
  /**
   * 年龄
   */
  private int age;
  private Lunar lunar;

  public LiuNian(DaYun daYun, int index) {
    this.daYun = daYun;
    this.lunar = daYun.getLunar();
    this.index = index;
    this.year = daYun.getStartYear() + index;
    this.age = daYun.getStartAge() + index;
  }

  public int getIndex() {
    return index;
  }

  public int getYear() {
    return year;
  }

  public int getAge() {
    return age;
  }

  /**
   * 获取干支
   *
   * @return 干支
   */
  public String getGanZhi() {
    int offset = LunarUtil.getJiaZiIndex(lunar.getYearInGanZhiExact()) + this.index;
    if (daYun.getIndex() > 0) {
      offset += daYun.getStartAge() - 1;
    }
    offset %= LunarUtil.JIA_ZI.length;
    return LunarUtil.JIA_ZI[offset];
  }

  public LiuYue[] getLiuYue() {
    int n = 12;
    LiuYue[] l = new LiuYue[n];
    for (int i = 0; i < n; i++) {
      l[i] = new LiuYue(this, i);
    }
    return l;
  }
}
