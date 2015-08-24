package md56ec6d14e76dc99554611d6566a7de39e;


public class MvxFragmentActivity
	extends md56ec6d14e76dc99554611d6566a7de39e.MvxEventSourceFragmentActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_setContentView:(I)V:GetSetContentView_IHandler\n" +
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.Support.Fragging.MvxFragmentActivity, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxFragmentActivity.class, __md_methods);
	}


	public MvxFragmentActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxFragmentActivity.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.Support.Fragging.MvxFragmentActivity, Cirrious.MvvmCross.Droid.Support.Fragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void setContentView (int p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (int p0);

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
