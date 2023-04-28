import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
//import { AngularFireAuth } from '@angular/fire/auth';


@Component({
  selector: 'app-forgotpass',
  templateUrl: './forgotpass.page.html',
  styleUrls: ['./forgotpass.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class ForgotpassPage implements OnInit {

  // email: string;
  // constructor(public afAuth: AngularFireAuth) { }

   ngOnInit() {}
  // }
  // async forgot() {
  //   const { email } = this;
  //   try {
  //     //kind of a hack
  //     const res = await this.afAuth.sendPasswordResetEmail(email);
  //     //alert('i am done');
  //   }
  //   catch (err) {
  //     console.dir(err);

  //   }

}

