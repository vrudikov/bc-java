package org.bouncycastle.tls;

/*
 * RFC 3546 3.3.
 */
public class CertChainType
{
    public static final short individual_certs = 0;
    public static final short pkipath = 1;

    public static String getName(short certChainType)
    {
        switch (certChainType)
        {
        case individual_certs:
            return "individual_certs";
        case pkipath:
            return "pkipath";
        default:
            return "UNKNOWN";
        }
    }

    public static String getText(short certChainType)
    {
        return getName(certChainType) + "(" + certChainType + ")";
    }

    public static boolean isValid(short certChainType)
    {
        return certChainType >= individual_certs && certChainType <= pkipath;
    }
}
