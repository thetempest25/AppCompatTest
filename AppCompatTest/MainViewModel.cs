using Cirrious.MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppCompatTest.Core.ViewModel
{
    public class MainViewModel : MvxViewModel
    {
        // fields
        string _username = "";
        public string Username { get { return _username; } set { _username = value;  RaisePropertyChanged(); }  }
        string _password = "";
        public string Password { get { return _password; } set { _password = value; RaisePropertyChanged(); } }

        // commands
        public IMvxCommand LoginCommand { get; private set; }
        

        // constructor
        public MainViewModel()
        {
            // bind commands
            LoginCommand = new MvxCommand(() => this.LoginCmd());
        }

        public void Init()
        {
            //...
        }
        
        void LoginCmd()
        {
            // do nothing
        }
    }
}
