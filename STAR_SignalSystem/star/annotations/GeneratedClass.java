package star.annotations;

import java.awt.Panel;
import java.io.Serializable;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

import star.event.Adapter;

public class GeneratedClass
{
	final static int PUBLIC = 1;
	final static int PROTECTED = 2;
	final static int PRIVATE = 4;
	final static int STATIC = 8;
	final static int ABSTRACT = 16;
	final static int FINAL = 32;
	final static int DEFAULT = 64;

	String className;
	int acc = 0;
	String extendsName;
	TreeSet<String> interfaces = new TreeSet<String>();
	TreeSet<Member> members = new TreeSet<Member>();
	TreeSet<Method> methods = new TreeSet<Method>();

	public GeneratedClass(String className, int acc)
	{
		this.className = className;
		this.acc = acc;
	}

	public void setParent(String extendsName)
	{
		this.extendsName = extendsName;
	}

	public void addInterface(String interfaceName)
	{
		interfaces.add(interfaceName);
	}

	public void addMember(int acc, String type, String name, String defaultValue)
	{
		Member member = new Member();
		member.acc = acc;
		member.type = type;
		member.name = name;
		member.value = defaultValue;
		members.add(member);
	}

	public void addMethod(int acc, String type, String name, String[] paramTypes, String[] varNames, String body)
	{
		Method method = new Method();
		method.acc = acc;
		method.type = type;
		method.name = name;
		method.paramTypes = paramTypes;
		method.varNames = varNames;
		method.body = body;
		methods.add(method);
	}

	public void addMethod(int acc, String type, String name, String[] paramTypes, String[] varNames, String[] throwables, String body  )
	{
		Method method = new Method();
		method.acc = acc;
		method.type = type;
		method.name = name;
		method.paramTypes = paramTypes;
		method.varNames = varNames;
		method.throwables = throwables ;
		method.body = body;
		methods.add(method);
	}

	public String getSource()
	{
		StringBuffer ret = new StringBuffer();
		ret.append("/* Generated by " + this.getClass().getName() + ", all changes will be lost */\n\n");
		ret.append(getPackageLine(className));
		ret.append("\n\n");
		ret.append(getClassLine(acc, className, extendsName, interfaces));
		ret.append("\n{\n");
		ret.append(getMembersSource());
		ret.append("\n");
		ret.append(getMethodsSoruce());
		ret.append("\n}");
		return ret.toString();
	}

	public String getPackageLine(String name)
	{
		if( name.lastIndexOf('.') != -1 )
		{
			return "package " + name.substring(0, name.lastIndexOf('.')) + ";";
		}
		else
		{
			return "//root package;";
		}
	}

	public String getClassLine(int acc, String className, String extendsName, TreeSet<String> interfaces)
	{
		StringBuffer ret = new StringBuffer();
		ret.append(getAccessors(acc));
		ret.append("class ");
		ret.append(className.substring(className.lastIndexOf('.') + 1));
		if( extendsName != null )
		{
			ret.append(" extends ");
			ret.append(extendsName);
		}
		if( interfaces.size() != 0 )
		{
			ret.append(" implements ");
			boolean comma = false;
			for (String inter : interfaces)
			{
				if( comma )
				{
					ret.append(", ");
				}
				ret.append(inter);
				comma = true;

			}
		}
		return ret.toString();
	}

	public String getMembersSource()
	{
		StringBuffer ret = new StringBuffer();
		if( members.size() != 0 )
		{
			for (Member m : members)
			{
				ret.append("\t");
				ret.append(getAccessors(m.acc));
				ret.append(m.type);
				ret.append(" ");
				ret.append(m.name);
				if( m.value != null )
				{
					ret.append(" = ");
					ret.append(m.value);
				}
				ret.append(";\n");
			}
		}
		return ret.toString();
	}

	public String getMethodsSoruce()
	{
		StringBuffer ret = new StringBuffer();
		if( methods.size() != 0 )
		{
			for (Method m : methods)
			{
				ret.append(getAccessors(m.acc));
				ret.append(m.type);
				ret.append(" ");
				ret.append(m.name);
				ret.append("(");
				if( m.paramTypes != null && m.paramTypes.length > 0 )
				{
					ret.append(m.paramTypes[0]);
					ret.append(" ");
					ret.append(m.varNames[0]);

					for (int i = 1; i < m.paramTypes.length; i++)
					{
						ret.append(", ");
						ret.append(m.paramTypes[i]);
						ret.append(" ");
						ret.append(m.varNames[i]);
					}
				}
				ret.append(")");
				if( m.throwables != null && m.throwables.length > 0 )
				{
					ret.append( " throws " ) ;
					ret.append( m.throwables[0] );
					for( int i = 1 ; i < m.throwables.length ; i++ )
					{
						ret.append(" ,");			
						ret.append( m.throwables[i] );
					}
				}
				if( (m.acc & ABSTRACT) != ABSTRACT )
				{
					ret.append("\n{\n");
					ret.append(indent(1, m.body));
					ret.append("\n}\n \n");
				}
				else
				{
					ret.append(";\n \n");
				}
			}
		}
		return indent(1, ret.toString());

	}

	String getAccessors(int acc)
	{
		StringBuffer ret = new StringBuffer();
		if( (acc & PUBLIC) == PUBLIC )
		{
			ret.append("public ");
		}
		if( (acc & PRIVATE) == PRIVATE )
		{
			ret.append("private ");
		}
		if( (acc & PROTECTED) == PROTECTED )
		{
			ret.append("protected ");
		}
		if( (acc & STATIC) == STATIC )
		{
			ret.append("static ");
		}
		if( (acc & ABSTRACT) == ABSTRACT )
		{
			ret.append("abstract ");
		}
		if( (acc & FINAL) == FINAL )
		{
			ret.append("final ");
		}

		return ret.toString();
	}

	String indent(int level, String text)
	{
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(text, "\n");
		StringBuffer tabs = new StringBuffer();
		for (int i = 0; i < level; i++)
		{
			tabs.append("\t");
		}
		boolean newLine = false;
		while( st.hasMoreTokens() )
		{
			if( newLine )
			{
				sb.append("\n");
			}
			sb.append(tabs);
			sb.append(st.nextToken());
			newLine = true;
		}
		return sb.toString();
	}

	class Member implements Comparable<Member>
	{
		int acc;
		String type;
		String name;
		String value;

		public int compareTo(Member o)
		{
			return name.compareTo(o.name);
		}

	}

	class Method implements Comparable<Method>
	{
		int acc;
		String type;
		String name;
		String[] paramTypes;
		String[] varNames;
		String body;
		String[] throwables;

		public int compareTo(Method o)
		{
			int cmp = name.compareTo(o.name);
			if( cmp == 0 )
			{
				if( paramTypes != null )
				{
					cmp = Arrays.toString(paramTypes).compareTo(Arrays.toString(o.paramTypes));
				}
				else
				{
					cmp = 1;
				}
			}
			return cmp;
		}

		public String toString()
		{
			return "Method: " + acc + " " + type + " " + name + " " + Arrays.toString(paramTypes);
		}

	}

	public static void main(String[] str)
	{
		GeneratedClass test = new GeneratedClass("a.b.c.Test", PUBLIC);
		test.addMember(PRIVATE | FINAL, Adapter.class.getName(), "adapter", "new " + Adapter.class.getName() + "(this)");
		test.addMethod(PUBLIC, Adapter.class.getName(), "getAdapter", null, null, "return this.adapter");
		test.addMethod(PUBLIC, "void", "addNotify", null, null, "super.addNotify()");
		test.addMethod(PUBLIC, "void", "removeNotify", null, null, "super.removeNotify()");
		test.addInterface("star.event.Listener");
		test.addInterface("star.event.Raiser");
		test.addInterface(Serializable.class.getName());
		test.setParent(Panel.class.getName());
	}

	public boolean hasMethod(String string)
    {
		for( Method m : methods )
		{
			if( m.name.equals(string))
			{
				return true ;
			}
		}
	    return false;
    }

}