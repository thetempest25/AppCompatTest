package md58aca534e09c59c5239d02f37b2cd334f;


public abstract class MvxCachingFragmentActivityCompat_1
	extends cirrious.mvvmcross.droid.support.appcompat.MvxCachingFragmentActivityCompat
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.Support.AppCompat.MvxCachingFragmentActivityCompat`1, Cirrious.MvvmCross.Droid.Support.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxCachingFragmentActivityCompat_1.class, __md_methods);
	}


	public MvxCachingFragmentActivityCompat_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxCachingFragmentActivityCompat_1.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.Support.AppCompat.MvxCachingFragmentActivityCompat`1, Cirrious.MvvmCross.Droid.Support.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
