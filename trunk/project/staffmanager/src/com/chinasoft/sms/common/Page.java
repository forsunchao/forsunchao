package com.chinasoft.sms.common;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Page
{
    private static final int MOD = 2;  
    private int numPerPage = 10;
    private int curPage = 1;
    private int firstResult;

  
    private int totalNum;


    private int totalPage;
   private int displayCount = 5;
    

    

    




    public int getFirstResult()
    {
      
        if (this.curPage < 1)
        {
            this.curPage = 1;
        }
        else if (this.curPage > this.getTotalPage())
        {
            
            this.curPage = totalPage;
        }
        this.firstResult = (this.curPage - 1) * this.numPerPage;
        return firstResult;
    }

    public int getCurPage()
    {
        return curPage;
    }

    public void setCurPage(int curPage)
    {
        this.curPage = curPage;
    }

    public int getNumPerPage()
    {
        return numPerPage;
    }

    public void setNumPerPage(int numPerPage)
    {
        this.numPerPage = numPerPage;
    }

    public void setTotalNum(int totalNum)
    {
        this.totalNum = totalNum;
    }

    public int getTotalNum()
    {
        return totalNum;
    }
 
    public int getTotalPage()
    {
        this.totalPage = (this.totalNum / this.numPerPage)
                + (0 == this.totalNum % this.numPerPage ? 0 : 1);
        return totalPage;
    }
    /**
     * 
     * @return lsit
     */
    @SuppressWarnings("unchecked")
    public List getList()
    {
        
        int n = (int)displayCount / MOD;       
        int m = this.curPage;
        List list = new ArrayList();       
        if (totalPage > displayCount)
        {            
            if (totalPage - curPage < n)
            {
                n = n + (n + curPage - totalPage);
            }
            int i = n;
            for (; i > 0; i--)
            {
                if ((m - i) < 0)
                {
                    break;
                }
                else if (m - i == 0)
                {
                    continue;
                }
                
                list.add(m - i);
            }
            
            for (int j = m; j <= totalPage && list.size() < displayCount; j++)
            {
                list.add(j);
            }
            
        }
        else
        {
            for (int i = 1; i <= totalPage; i++)
            {
                list.add(i);
            }
        }
        
        return list;
    }

    public void setTotalPage(int totalPage)
    {
        this.totalPage = totalPage;
    }






}

