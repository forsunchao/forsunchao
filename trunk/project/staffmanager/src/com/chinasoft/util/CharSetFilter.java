package com.chinasoft.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**

 * 
 * @author sKF12179
 */

public class CharSetFilter implements Filter
{

    private FilterConfig filterConfig = null;

    private String encoding = "";

    /**
     * .
     * @param servletRequest servletRequest
     * @param servletResponse servletResponse
     * @param filterChain filterChain
     * @throws IOException IOException
     * @throws ServletException ServletException
     */
    public void doFilter(ServletRequest servletRequest,
            ServletResponse servletResponse, FilterChain filterChain)
        throws IOException, ServletException
    {
	    HttpServletRequest p=(HttpServletRequest)servletRequest;
    	String path= p.getContextPath()+p.getServletPath();
        if (encoding != null)
        {
            servletRequest.setCharacterEncoding(encoding);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * .
     * 
     */
    public void destroy()
    {
        filterConfig = null;
        encoding = null;
    }

    /**
     * .
     * @param filterConfigInit filterConfig
     * @throws ServletException ServletException
     */
    public void init(FilterConfig filterConfigInit) throws ServletException
    {
        this.filterConfig = filterConfigInit;
        this.encoding = filterConfigInit.getInitParameter("encoding");
    }

    /**
     * get encoding
     * @return the encoding
     */
    public String getEncoding()
    {
        return encoding;
    }

    /**
     * set encoding
     * @param encoding the encoding to set
     */
    public void setEncoding(String encoding)
    {
        this.encoding = encoding;
    }

    /**
     * get filterConfig
     * @return the filterConfig
     */
    public FilterConfig getFilterConfig()
    {
        return filterConfig;
    }

    /**
     * set filterConfig
     * @param filterConfig the filterConfig to set
     */
    public void setFilterConfig(FilterConfig filterConfig)
    {
        this.filterConfig = filterConfig;
    }
}

