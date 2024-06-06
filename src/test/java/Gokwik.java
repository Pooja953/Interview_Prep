import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class Gokwik {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://dashboard.gokwik.co/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("poojanthakur953@gmail.com");
//        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

//        driver.findElement(By.xpath("//input[@id=\"company-name\"]")).sendKeys();

//        public static void main(String args[])
//        {
            String str="Poooojjjaaa";
            Map<String,Integer> map1=new LinkedHashMap<>();
            for(String s1:str.split(""))
            {
                map1.put(s1, map1.getOrDefault(s1,0)+1);
            }
            System.out.println(map1);
            Map<String,Integer> map3=sortMapByValueAndAlpha(map1);
            System.out.println(map3);
        }

        public static Map<String, Integer> sortMapByValueAndAlpha(Map<String, Integer> map) {
            // Convert the map to a list of entries
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

            // Sort the list by value and then by key
            Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    int valueCompare = o1.getValue().compareTo(o2.getValue());
                    if (valueCompare == 0) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    return valueCompare;
                }
            });

            // Convert the sorted list back to a map
            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : entryList) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            return sortedMap;
        }
    }




