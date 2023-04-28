import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-register',
  templateUrl: './register.page.html',
  styleUrls: ['./register.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class RegisterPage implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  firstname: string;
  lastname: string;
  username: string;
  email: string;
  password: string;
 confirmpass: string;
  tel: string;

  // async register() {
  //   const { firstname, lastname, username, email, password, confirmpass, tel } = this;
  //   if (password !== confirmpass) {
  //     return console.error('passwords are not match');

  //   }
  //   else if (firstname === null) {
  //     return console.error('first name cannot be null');
  //   }
  //   else if (lastname === null) {
  //     return console.error('last name cannot be null');
  //   }
  //   else if (username === null) {
  //     return console.error('user name cannot be null');
  //   }
  //   else if (email === null) {
  //     return console.error('email cannot be null');
  //   }
  //   else if (password === null) {
  //     return console.error('password cannot be null');
  //   }
  //   else if (confirmpass === null) {
  //     return console.error('confirm password cannot be null');
  //   }
  //   else if (tel === null) {
  //     return console.error('tel cannot be null');
  //   }
  //   try {
  //     const res = await this.AfAuth.createUserWithEmailAndPassword(email, password);
  //     console.log(res);
  //   }
  //   catch (error) {
  //     console.dir(error);
  //   }
  // }
}
