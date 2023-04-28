import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormGroup, FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class LoginPage implements OnInit {

  Email: string;
  password: string = '';
  loginform: FormGroup;
   constructor(Email:string,password:string,loginForm:FormGroup) 
   {
    this.Email=Email;
    this.password=password;
    this.loginform=loginForm;
   }

  ngOnInit() {
    /*  this.loginform = new FormGroup({
        email: new FormControl('', [
          Validators.required,
          //  Validators.EmailValidator,
        ])
      });//end of formgroup constructor*/
  }
  async login() {
    const { Email, password } = this;
    try {
      // //kind of a hack
      // const res = await this.afAuth.signInWithEmailAndPassword(Email, password);
      // //alert('i am done');
    }
    catch (err) {
    //   console.dir(err);
    //   if (err.code === "auth/user-not-found") {
    //     console.log('user not found');
    //   }
     }

    }
  }
