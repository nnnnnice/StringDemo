package demo;

import demo.StringDemo;
import junit.framework.TestCase;

public class StringDemoTest extends TestCase 
{
	private StringDemo str;
	protected void setUp()
	{
		str = new StringDemo();
	}
	public void testSmallString() 
	{
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");		
	}
	public void testLongString()
	{
		assertEquals("һ���ַ���Сд",str.smallString("ABCDEFG"),"abcdefg");
	}
	public void testMixShortString()
	{
		assertEquals("��Сд��ϵĶ��ַ�����Сд",str.smallString("Ab"),"ab");
	}
	public void testMixLongString()
	{
		assertEquals("��Сд��ϵĳ��ַ�����Сд",str.smallString("AbCDefG"),"abcdefg");
	}
	public void testError()
	{
		assertEquals("���Դ���",str.smallString(""),"error");
	}
	public void testAnyString()
	{
		assertEquals("����һ�������ַ���",str.smallString("13Acb32D"),"13acb32d");
	}
	public void testStringWithSpace()
	{
		assertEquals("����һ�����ո���ַ���",str.smallString("13Acb 32D"),"13acb 32d");
	}
	public void testStringWithChineseComma()
	{
		assertEquals("����һ�������Ķ��ŵ��ַ���",str.smallString("13Acb��32D"),"13acb��32d");
	}
	public void testStringWithEnglishComma()
	{
		assertEquals("����һ����Ӣ�Ķ��ŵ��ַ���",str.smallString("13Acb,32D"),"13acb,32d");
	}
	public void testChineseString()
	{
		assertEquals("����һ��������",str.smallString("��"),"��");
	}
}

