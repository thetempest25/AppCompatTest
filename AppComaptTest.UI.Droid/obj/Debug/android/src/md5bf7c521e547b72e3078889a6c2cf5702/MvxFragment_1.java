package md5bf7c521e547b72e3078889a6c2cf5702;


public abstract class MvxFragment_1
	extends md5bf7c521e547b72e3078889a6c2cf5702.MvxFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.Support.Fragging.Fragments.MvxFragment`1, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxFragment_1.class, __md_methods);
	}


	public MvxFragment_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxFragment_1.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.Support.Fragging.Fragments.MvxFragment`1, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
