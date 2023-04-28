import { Component } from '@angular/core';
import { IonicModule, ModalController } from '@ionic/angular';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router } from '@angular/router';
import { AddchildComponent } from '../addchild/addchild.component';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  standalone: true,
  imports: [IonicModule, ExploreContainerComponent],
})
export class Tab1Page {
  constructor(public ModalCtrl: ModalController, public router: Router) { }
  name: string;
  age: number;
  gender: any;
  children = [{}];
  public showmodal() {
    const modal1 = this.ModalCtrl.create({
      component: AddchildComponent
    });
    modal1.then(mdl => {
      mdl.present();
      modal1.then(md => md.onDidDismiss().then((data: any) => {
        if (data) {
          const child1 = data.data.obj;
          this.children.push(child1);
          console.log(child1);

        }
      }));
    }
    );
  }

  public cancel() {
    this.ModalCtrl.dismiss({
      dismissed: true
    });

  }
  public cards() {
    this.router.navigateByUrl('my-cards');
  }
  public market() {
    this.router.navigateByUrl('market');
  }
}


