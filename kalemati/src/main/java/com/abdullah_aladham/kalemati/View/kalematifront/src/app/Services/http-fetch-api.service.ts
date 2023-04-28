import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class HttpFetchApiService {
public apiKey:any;
  constructor(public http:HttpClient, apiKey:any) {
    this.apiKey=apiKey;
   }

  getPackages(PackageName:string){
    return this.http.get('http://localhost:8080/'+PackageName);//get cards api 
  }
  AddPackage(){
    this.http.post('','');
    //code to add package
  }
  deletepackage(){
    this.http.delete('');
  }
  
}
