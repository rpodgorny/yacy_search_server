// indexContainer.java
// (C) 2006 by Michael Peter Christen; mc@anomic.de, Frankfurt a. M., Germany
// first published 20.05.2006 on http://www.anomic.de
//
// This is a part of YaCy, a peer-to-peer based web search engine
//
// $LastChangedDate: 2006-04-02 22:40:07 +0200 (So, 02 Apr 2006) $
// $LastChangedRevision: 1986 $
// $LastChangedBy: orbiter $
//
// LICENSE
// 
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

// an index container is a set of index entries

package de.anomic.index;

import java.util.Iterator;

import de.anomic.kelondro.kelondroOrder;

public interface indexContainer {
    
    public void setWordHash(String newWordHash);
    
    public void clear();
    
    public int size();
    
    public long updated();
    
    public kelondroOrder order();
    
    public String wordHash();

    public int add(indexEntry entry);
    
    public int add(indexEntry entry, long updateTime);
    
    public int add(indexEntry[] entries, long updateTime);
    
    public int add(indexContainer c, long maxTime);

    public boolean contains(String urlHash) ;

    public indexEntry get(String urlHash);
    
    public indexEntry[] getEntryArray() ;

    public indexEntry remove(String urlHash);

    public int removeEntries(String wordHash, String[] urlHashes, boolean deleteComplete);

    public Iterator entries();

    public String toString();
    
    public int hashCode();

    //public void joinConstructive(indexContainer c, long time, int maxDistance);
    
}
