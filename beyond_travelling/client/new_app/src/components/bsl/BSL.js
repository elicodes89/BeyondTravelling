import React, { useState, useEffect } from 'react';
import HotelList from './HotelList';
// import PlayVideo from './PlayVideo';


const BSL = () => {
    const [regions, setRegions] = useState([]);


    useEffect(() => {
        getRegions();
    }, [])


    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))

    }

    function task(){
        console.log(getRegions)
    }
    setTimeout(task, 3000);
    

    
    return (
        <>
        <div className="main-container">
        <h2>Please choose region</h2>
            <HotelList regions = {regions}/>
        </div>  
        {/* <PlayVideo /> */}
        </>
      
    );
};

export default BSL;