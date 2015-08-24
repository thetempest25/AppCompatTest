package cirrious.mvvmcross.droid.support.appcompat;


public class MvxCachingFragmentActivityCompat
	extends md56ec6d14e76dc99554611d6566a7de39e.MvxCachingFragmentActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPostCreate:(Landroid/os/Bundle;)V:GetOnPostCreate_Landroid_os_Bundle_Handler\n" +
			"n_getMenuInflater:()Landroid/view/MenuInflater;:GetGetMenuInflaterHandler\n" +
			"n_setContentView:(I)V:GetSetContentView_IHandler\n" +
			"n_setContentView:(Landroid/view/View;)V:GetSetContentView_Landroid_view_View_Handler\n" +
			"n_setContentView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V:GetSetContentView_Landroid_view_View_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_addContentView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V:GetAddContentView_Landroid_view_View_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_onPostResume:()V:GetOnPostResumeHandler\n" +
			"n_onTitleChanged:(Ljava/lang/CharSequence;I)V:GetOnTitleChanged_Ljava_lang_CharSequence_IHandler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;:GetOnCreateView_Landroid_view_View_Ljava_lang_String_Landroid_content_Context_Landroid_util_AttributeSet_Handler\n" +
			"n_attachBaseContext:(Landroid/content/Context;)V:GetAttachBaseContext_Landroid_content_Context_Handler\n" +
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.Support.AppCompat.MvxCachingFragmentActivityCompat, Cirrious.MvvmCross.Droid.Support.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxCachingFragmentActivityCompat.class, __md_methods);
	}


	public MvxCachingFragmentActivityCompat () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxCachingFragmentActivityCompat.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.Support.AppCompat.MvxCachingFragmentActivityCompat, Cirrious.MvvmCross.Droid.Support.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onPostCreate (android.os.Bundle p0)
	{
		n_onPostCreate (p0);
	}

	private native void n_onPostCreate (android.os.Bundle p0);


	public android.view.MenuInflater getMenuInflater ()
	{
		return n_getMenuInflater ();
	}

	private native android.view.MenuInflater n_getMenuInflater ();


	public void setContentView (int p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (int p0);


	public void setContentView (android.view.View p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (android.view.View p0);


	public void setContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1)
	{
		n_setContentView (p0, p1);
	}

	private native void n_setContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1);


	public void addContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1)
	{
		n_addContentView (p0, p1);
	}

	private native void n_addContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1);


	public void onPostResume ()
	{
		n_onPostResume ();
	}

	private native void n_onPostResume ();


	public void onTitleChanged (java.lang.CharSequence p0, int p1)
	{
		n_onTitleChanged (p0, p1);
	}

	private native void n_onTitleChanged (java.lang.CharSequence p0, int p1);


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public android.view.View onCreateView (android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3)
	{
		return n_onCreateView (p0, p1, p2, p3);
	}

	private native android.view.View n_onCreateView (android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3);


	public void attachBaseContext (android.content.Context p0)
	{
		n_attachBaseContext (p0);
	}

	private native void n_attachBaseContext (android.content.Context p0);

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
