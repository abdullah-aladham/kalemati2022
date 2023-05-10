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
    <h1 style={{textAlign: 'center',color: '#F6B968'}}>Kalemati | كـلماتي </h1>
    
<div className="mb-2"> <Button size="lg" variant='none'><Icon.PersonCircle /></Button> </div>



    </div>
    <Aboutus />
       <h2  style={{textAlign: 'center',color: '#F6B968'}}>My Packages</h2>
       <Kalemati />
       <h2 style={{textAlign: 'center',color: '#F6B968'}}>Recomended Packages</h2>
       <Recomended />
       <Footer />
       </>
  );
}

export default App;
