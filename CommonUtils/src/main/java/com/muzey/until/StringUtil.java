package com.muzey.until;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

    /**
     * 取出地址栏参数传递的特殊字符，比如单引号
     * @param v
     * @return
     */
    public static String parseValue(String v)
    {
        if (v == null) return "";
        v = v.replace("'", "");

        return v;
    }
    
    public static String trim(String str)
    {
      if (CheckUtil.isNullOrEmpty(str)) {
        return null;
      }
      return StringUtils.trim(str);
    }
    
    public static String toStr(Object v)
    {
        if (v == null)
        {
            return "";
        }
        return String.valueOf(v);
    }
}
