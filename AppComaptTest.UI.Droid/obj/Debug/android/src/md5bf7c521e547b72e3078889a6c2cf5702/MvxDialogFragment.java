package md5bf7c521e547b72e3078889a6c2cf5702;


public abstract class MvxDialogFragment
	extends md59769c1151987f84e6ecb7e06b4ba0821.MvxEventSourceDialogFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.Support.Fragging.Fragments.MvxDialogFragment, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxDialogFragment.class, __md_methods);
	}


	public MvxDialogFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxDialogFragment.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.Support.Fragging.Fragments.MvxDialogFragment, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
