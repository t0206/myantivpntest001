package vpnblocker.novpn.pluginnovpn.novpn.NoVPN.utils;

import okhttp3.*;
import org.json.simple.JSONObject;

import java.io.IOException;

public class JsonObjectUtil{

    public static String getString(String jsonObject,String getString) throws IOException {
        String url = "http://www.casareal.co.jp";
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        Response response = call.execute();
        ResponseBody body = response.body();
        JSONObject jobject = new JSONObject(body.string());
        return  jobject.get("hoge");
    }
}
