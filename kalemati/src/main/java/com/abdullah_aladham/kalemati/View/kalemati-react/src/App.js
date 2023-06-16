import React from 'react';
//import './App.css';
//import kalemati from './kalemati';
import Recomended from './recomended';
import Kalemati from './kalemati';
import Aboutus from './aboutus';
// import Sidebar from './Sidebar';
import { Button, Dropdown } from 'react-bootstrap';
import * as Icon from 'react-bootstrap-icons';
import Footer from './footer';
import DropdownProfile from './dropdown';
import Contactus from './Contactus';
import Sidebarmenu from './sidebarmenu/sidebarmenu';
import { Routes,Route } from 'react-router';
import KalematiPage from './Pages/KalematiPage';

function App() {

  return (
    
    <> 
  {/* <Routes>
    {/* <Route path='/' element={<App/>}/> */}
    {/* <Route path="./KalematiPage" element={<KalematiPage/>} /> */}
  {/* </Routes> */} 
<div className='container'>

 <div className="mb-2 position-absolute top-0 start-0"> 
<Sidebarmenu/>
</div>
    <h1 style={{textAlign: 'center',color: '#F6B968'}}>Kalemati | كـلماتي </h1>
    



  </div>
  
    <Aboutus style={{margin:'auto'}} />
       <h2  style={{textAlign: 'center',color: '#F6B968'}}>My Packages</h2>
       <Kalemati />
       <h2 style={{textAlign: 'center',color: '#F6B968'}}>Recomended Packages</h2>
       <Recomended />

       <Contactus />
       <Footer />
       
       </>
  );
  
}

export default App;
