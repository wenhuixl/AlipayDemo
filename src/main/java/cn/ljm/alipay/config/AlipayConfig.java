package cn.ljm.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created  on 2019-9-09
 */
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2021000116664286"; //测试

    // 商户私钥，您的PKCS8格式RSA2私钥
   public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDB2eK0ygPkRDBDMP/XPUD3brMHgr402aGo1WQmKEkwnB7cWwWmon1suB3pPeizqE9dH+hPeP3dSQpKJPLOSWY/L/S9VtzQlsJ0N78G8wxQ3QhOg/vprrifF6Ayr3sIh/UOB6Q4YcygyjFhfLomecOM+DQf4ICxzmyir3DXCpQ+rUQNlV/Ncgbf7+jlWLldupCylqW6bfi+gRp3gcaHfiserZAhxu9OVKglixzHlkdKbJ7Dfr1aiZI2vlI9FB8d86VXykjs//78rO5rH7xONY6e65fspaj3xRb9Eq78ECz4hzQ3sFQAmsJxqe2FQCAiChHmM6lm1e3GEYSU/6devHcHAgMBAAECggEAK0hkFyvYDJqxD/+b0EpL/DNKZA3sPE6viswCrYZnOSRSu67TJy62xJSjkRWSpLKa7dcW/s+sF0Gcu4teb3LyEn+5rKD9ctGGn35m971C7bc8iJNtpvKtJFCZI1gNJ417yOMp5rDniKs8tWCtC7Q6VnqA4PE2qvzFQtnbXxhsm0We7uR7tWdjKvAJN2GFk196+WYEVUoMUPbjix7237cW/CqTsCl3LZZ2TG2dfNBddc5DAOxIUPqMBzN29NrXVgmtyk1kdFW2QbWTPOIAbOZDxQDTBBrZt3leqZLZlVHu8Zhx+56P9gt9IHs1TVWL3zaixIUI+SMm48yoB1EiU7G0YQKBgQDt9WlbJlQfHTZTALGzx6eslvZC1daSdvnVt+vKRWt9WZUKIzTsnYSNkyrXOlQ/K7eFjy9aqQfrPdSmqkzbmTaxlx4CrsaTzf5DHga0s0oKbQsiqqUlzrrvJ8X5oeMaXkUy+cdf7uLf0CNkSzVhBT0YqU06x5OITFyL1Ciah6cGEQKBgQDQjGHJUA+9+kReSadoT4i/LcBNJEP06duwaR5AcMjSRuERWCP6+X4AzdMXRVKBxm8bAMh/RnD2ULFMrS5xtOaXsiGz/fsXmlAKjUOfuSx64gm+xZT+Nl5+w++ZTiXuImUSVUGAXbmUSkqD+AUFrD+U66h+A7G7cftxgI/IcFqzlwKBgQCF3xkkpI2S65ZSYAOZRuu4Fz34H+GViMXJTK2koCV24d0NVP1DWOLn2zGw4CnhWDDpPMLBWHMSDzkBgrG2oZ25j3DcxYMGSE+RZuUS6ALxlqM7H5HFkWZtgYzJgiAIB50arpdSC00r6SbgF8eyC4Zxx12hggIoHf261OL6/PIkYQKBgQCQ2fDRsxo8CiiSlPYCLbv9jfmTmyzYX9aHoXuxpqTV6QVK1r2nBMPQKyYDc9Lq8LkbOGAKhxLPAx0i9Obdc5j2pHNkYXSV4EjYC2Z8+lE6yOWb7ACg0YKw6cbx5KXT0XACW9UzI+ZSaYd4Qjy6w/klpslRPZ+lYnYTUAiOX/uf4QKBgDySfhFGJN/0cyAdgGOvPWf/5e4kD5YgMj4htQIrys8PV1K9jqN+h7PfAHEI6PlPEtL2SjiK693DkHXYmGekS6otehz5HV2jH+2bdAgN+lC0u+1FlnRNmrnnvBwmeX6TVNgQ1JevyjBVGoyrZvHmydy+k1BJ9QW1Zh55BddGLeSi";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzGfXvdUJrGKsEHRcWiJMNj3KDRqcpsBcUTrgk2avduAGjMGUIX+hJpchfEyUGJ48QaYu+6IqM3g9VpJTta4Cm9vUyBT2HsTyFb2vqvmT61WxWdkdM2gJVkujalJuLOUHs2vg7PxJYJlJLsvFbp8q8GKgMariGuCQvy0mlmppK2SUVKnc6UpRy9QYzIcrSbssR9II8rPHaQzzic8SQfXIonmqeMvM6GXKy7jaDNA8AG5aIO14vAfF5Qn1ZWUFTe6SFyokS6ZK9RQB6HrfKZ6ZhusE0VjaWxckKjsGo1HznFReoIYDE/bUnCig6m/LnjWQubb2Fp2y1vZzUwzekFpV0QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://uwb.natapp1.cc/Alipay/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://uwb.natapp1.cc/Alipay/returnUrl";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "UTF-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do"; //测试

    // 支付宝网关
    public static String log_path = "E:\\";

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
