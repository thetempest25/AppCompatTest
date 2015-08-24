using Cirrious.CrossCore.Plugins;
using Cirrious.MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppCompatTest.Core
{
    public class CoreApp : MvxApplication
    {
        public CoreApp()
        {
            
        }

        public override void LoadPlugins(IMvxPluginManager pluginManager)
        {
            base.LoadPlugins(pluginManager);
        }

    }
}
