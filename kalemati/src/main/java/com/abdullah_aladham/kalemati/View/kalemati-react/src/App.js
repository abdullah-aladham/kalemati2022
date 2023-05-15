import React from 'react';
//import './App.css';
//import kalemati from './kalemati';
import Recomended from './recomended';
import Kalemati from './kalemati';
import Aboutus from './aboutus';
import Sidebar from './Sidebar';
import { Button } from 'react-bootstrap';
import * as Icon from 'react-bootstrap-icons';
import Footer from './footer';

function App() {

  return (
    
    <> 
<div className='container'>
<div className="mb-2 position-absolute top-0 start-0"> <Button size="lg" variant='none'><Icon.List style={{color:'#f6b968'}} /></Button> </div>

    <h1 style={{textAlign: 'center',color: '#F6B968'}}>Kalemati | كـلماتي </h1>
    
<div className="mb-2 position-absolute top-0 end-0"> <Button size="lg" variant='none'><Icon.PersonCircle style={{color:'#f6b968'}} /></Button> </div>



  </div>
  
    <h2  style={{textAlign: 'center',color: '#F6B968'}}>About Us</h2>

    <Aboutus style={{marginBottom:'10px'}} />
       <h2  style={{textAlign: 'center',color: '#F6B968'}}>My Packages</h2>
       <Kalemati />
       <h2 style={{textAlign: 'center',color: '#F6B968'}}>Recomended Packages</h2>
       <Recomended />
       <Footer />
       </>
  );
}

export default App;
