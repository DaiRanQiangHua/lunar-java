# lunar [![License](https://img.shields.io/badge/license-MIT-4EB1BA.svg?style=flat-square)](https://github.com/6tail/lunar/blob/master/LICENSE)

lunar is a calendar library for Solar and Chinese Lunar.

> Support since java 1.5

[简体中文](https://github.com/6tail/lunar-java/blob/master/README.md)

### Release

```xml
<dependency>
  <groupId>cn.6tail</groupId>
  <artifactId>lunar</artifactId>
  <version>1.0.0</version>
</dependency>
```
 
### Snapshot

```xml
<repository>
  <id>sonatype</id>
  <url>https://oss.sonatype.org/content/groups/public/</url>
  <snapshots>
    <enabled>true</enabled>
    <updatePolicy>daily</updatePolicy>
    <checksumPolicy>warn</checksumPolicy>
  </snapshots>
</repository>
```

```xml
<dependency>
  <groupId>cn.6tail</groupId>
  <artifactId>lunar</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Download

If you will use jars in your projects, I suggest you to download latest snapshot versions with less bugs.

[Download](https://oss.sonatype.org/content/groups/public/cn/6tail/lunar/)

## Example

    import com.nlf.calendar.Lunar;
     
    /**
     * 阴历示例
     *
     */
    public class LunarSample{
      public static void main(String[] args){
        //今天
        //Lunar date = new Lunar();
         
        //指定阴历的某一天
        Lunar date = new Lunar(1986,4,21);
        System.out.println(date.toFullString());
        System.out.println(date.getSolar().toFullString());
      }
    }

Output:

    壹玖捌陆年肆月廿一 丙寅(虎)年 癸巳(蛇)月 癸酉(鸡)日 子(鼠)时 纳音[炉中火 长流水 剑锋金 海中金] 星期四 北方玄武 星宿[斗木獬](吉) 彭祖百忌[癸不词讼理弱敌强 酉不会客醉坐颠狂] 喜神方位[巽](东南) 阳贵神方位[巽](东南) 阴贵神方位[震](正东) 福神方位[兑](正西) 财神方位[离](正南) 冲[(丁卯)兔] 煞[东]
    1986-05-29 00:00 星期四 双子座

## Documentation

Please visit [http://6tail.cn/calendar/api.html](http://6tail.cn/calendar/api.html "http://6tail.cn/calendar/api.html")

## Contact

<a target="_blank" href="https://jq.qq.com/?_wv=1027&k=5F9Pbf0"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="lunar" title="lunar"></a>
