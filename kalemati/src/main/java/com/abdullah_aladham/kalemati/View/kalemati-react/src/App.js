import React from 'react';
//import './App.css';
//import kalemati from './kalemati';
import Recomended from './recomended';
import Kalemati from './kalemati';

function App() {

  return (
    
    <> 
    
    <h1 style={{textAlign: 'center',color: '#F6B968'}}>Kalemati | كـلماتي</h1>
       <h2  style={{textAlign: 'center',color: '#F6B968'}}>My Packages</h2>
       <Kalemati />
       <h2 style={{textAlign: 'center',color: '#F6B968'}}>Recomended Packages</h2>
       <Recomended />
       </>
  );
}

export default App;
