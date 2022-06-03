import React from 'react';
import Header from '../components/Header';
import './Home.css';

function Home () {

return (
  <>
  <Header />
    <div className='title'>
    <h2>Your travel app for accessible holidays</h2>
    </div>
    
    <div className='flex-container'>

{/* have clickable images as hyperlink */}
    <a href='src/components/bsl/BSL.js'> <img className="bsl_sign" src={require("../access_icons/wheelchair.png")} alt='wheelchairimg' width="500" height="500"/> </a>
    <a href='src/components/wheelchair/AccessibleHotels.js'> <img className="wheelchair" src={require("../access_icons/sign.png")} alt='signimg' width="500" height="500"/> </a>
    </div>
  </>

  );
};
export default Home;