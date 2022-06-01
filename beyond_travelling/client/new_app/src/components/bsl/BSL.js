import React, { useState, useEffect } from 'react';
import HotelList from './HotelList';
import HotelDetail from './HotelDetail';


const BSL = () => {
    // const [region, setRegions] = useState([]);
    // const [selectedRegion, setSelectedRegion] = useState(null);

    // useEffect(() => {
    //     getRegions();
    // }, [])

    // const getRegions = function(){
    //     fetch('http://localhost:8080/countries')
    //     .then(res => res.json())
    //     .then(regions => setRegions(regions))
    // }

    // const onRegionClick = function(region){
    //     setSelectedRegion(region);
    // }

    // const onHotelSelected = function(hotel){
    //     setSelectedHotel(hotel);
    // }

    return (
        <div className="main-container">
            <h1>BSL Hotels here</h1>
            {/* <HotelList regions={region} onRegionClick={onRegionClick} /> */}
            {/* {selectedRegion ? <HotelDetail selectedRegion={selectedRegion} /> : null} */}
            
        </div>
    )
}

export default BSL;


