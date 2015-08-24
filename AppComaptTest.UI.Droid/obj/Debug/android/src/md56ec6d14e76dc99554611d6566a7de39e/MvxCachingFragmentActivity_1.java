package md56ec6d14e76dc99554611d6566a7de39e;


public abstract class MvxCachingFragmentActivity_1
	extends md56ec6d14e76dc99554611d6566a7de39e.MvxCachingFragmentActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.Support.Fragging.MvxCachingFragmentActivity`1, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxCachingFragmentActivity_1.class, __md_methods);
	}


	public MvxCachingFragmentActivity_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxCachingFragmentActivity_1.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.Support.Fragging.MvxCachingFragmentActivity`1, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
