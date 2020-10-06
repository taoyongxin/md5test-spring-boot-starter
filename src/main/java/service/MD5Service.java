package service;

import util.MD5Util;

/**
 * @author Tao
 * @version 1.0
 * @ClassName MD5Service
 * @Description TODO
 * @date 2020-10-06 18:10
 **/
public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}
